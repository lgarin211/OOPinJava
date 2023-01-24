import numpy as np

def power_method(A, x0, epsilon=1e-6, max_iter=5):
    """
    This function finds the largest eigenvalue and corresponding eigenvector of a square matrix A,
    using the power method.
    It takes a square matrix A, an initial approximation of the eigenvector x0,
    a tolerance epsilon (for the convergence criterion) and a maximum number of iterations max_iter.
    It returns the eigenvalue and eigenvector as a tuple.
    """
    x = x0
    for i in range(max_iter):
        x_next = np.matmul(A, x) # matrix-vector multiplication A*x
        lambda_next = np.linalg.norm(x_next, 2) # eigenvalue approximation
        x_next /= lambda_next # normalization of the eigenvector approximation
        if np.abs(lambda_next - np.linalg.norm(x, 2)) < epsilon:
            return lambda_next, x_next
        x = x_next
    return lambda_next, x_next

# Example usage
A = np.array([[-30, 10, 20], [10, 40, -50], [20, -50, -10]])
x0 = np.array([1, 0, 0]) # any non-zero initial vector will work
# eigenvalue, eigenvector = power_method(A, x0, max_iter=5)
eigenvalue, eigenvector = power_method(A, x0, max_iter=5)
print("Eigenvalue: ", eigenvalue)
# print("Eigenvector: ", eigenvector)