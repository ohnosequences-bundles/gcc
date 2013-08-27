package ohnosequences.statika

import ohnosequences.statika._
import sys.process._

case object GCC extends Bundle() {

  val metadata = generated.metadata.GCC

  def install[D <: DistributionAux](distribution: D): InstallResults = {
    val result = Seq("yum", "install", "gcc", "-y").!
    if (result == 0) success(metadata+" is installed")
    else failure("Couldn't install "+metadata)
  }

}
