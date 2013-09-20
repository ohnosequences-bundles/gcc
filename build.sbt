name := "gcc"

description := "A bundle for gcc tool"

homepage := Some(url("https://github.com/ohnosequences/gcc"))

organization := "ohnosequences"

organizationHomepage := Some(url("http://ohnosequences.com"))

licenses := Seq("AGPLv3" -> url("http://www.gnu.org/licenses/agpl-3.0.txt"))

bundleObjects := Seq("ohnosequences.statika.GCC")
