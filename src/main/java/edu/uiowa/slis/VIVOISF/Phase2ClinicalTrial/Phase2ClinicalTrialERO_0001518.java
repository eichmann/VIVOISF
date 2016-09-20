package edu.uiowa.slis.VIVOISF.Phase2ClinicalTrial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase2ClinicalTrialERO_0001518 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase2ClinicalTrialERO_0001518 currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase2ClinicalTrialERO_0001518.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Phase2ClinicalTrialERO_0001518Iterator thePhase2ClinicalTrialERO_0001518Iterator = (Phase2ClinicalTrialERO_0001518Iterator)findAncestorWithClass(this, Phase2ClinicalTrialERO_0001518Iterator.class);
			pageContext.getOut().print(thePhase2ClinicalTrialERO_0001518Iterator.getERO_0001518());
		} catch (Exception e) {
			log.error("Can't find enclosing Phase2ClinicalTrial for ERO_0001518 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase2ClinicalTrial for ERO_0001518 tag ");
		}
		return SKIP_BODY;
	}
}

