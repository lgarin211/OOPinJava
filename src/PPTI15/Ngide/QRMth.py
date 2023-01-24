import numpy as np

def QR_method(A, epsilon=1e-6, max_iter=1000):
    """
    This function finds the eigenvalues of a square matrix A,
    using the QR method.
    It takes a square matrix A, a tolerance epsilon (for the convergence criterion)
    and a maximum number of iterations max_iter.
    It returns the eigenvalues as a list.
    """
    n = A.shape[0]
    eigenvalues = []
    for i in range(max_iter):
        Q, R = np.linalg.qr(A) # QR decomposition of A
        A = np.matmul(R, Q) # A <- R*Q
        for j in range(n):
            if j < n - 1:
                if abs(A[j, j + 1]) < epsilon: 
                    eigenvalues.append(A[j, j])
            else:
                eigenvalues.append(A[j, j])
    return eigenvalues

# Example usage
A = np.array([[2, 2, 4], [1, 3, 5], [2, 3, 4]])
eigenvalues = QR_method(A, max_iter=5)
print("Eigenvalues: ", eigenvalues)