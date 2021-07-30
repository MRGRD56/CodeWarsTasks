function int32ToIp(int32) {
    if (int32 > 4294967295) {
        throw new Error("Invalid number");
    }

    const int32Hex = ("00000000" + (+int32).toString(16)).slice(-8);
    const ipOctets = [];
    for (let i = 0; i < int32Hex.length; i += 2) {
        const octet = Number.parseInt(int32Hex.substring(i, i + 2), 16);
        ipOctets.push(octet);
    }

    return ipOctets.join(".");
}