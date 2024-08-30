func solution(my_string string, overwrite_string string, s int) string {
    return my_string[:s]+overwrite_string+my_string[len(overwrite_string)+s:]
}