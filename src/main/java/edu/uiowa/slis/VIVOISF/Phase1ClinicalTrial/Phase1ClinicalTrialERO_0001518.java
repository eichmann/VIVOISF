package edu.uiowa.slis.VIVOISF.Phase1ClinicalTrial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase1ClinicalTrialERO_0001518 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase1ClinicalTrialERO_0001518 currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase1ClinicalTrialERO_0001518.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Phase1ClinicalTrialERO_0001518Iterator thePhase1ClinicalTrialERO_0001518Iterator = (Phase1ClinicalTrialERO_0001518Iterator)findAncestorWithClass(this, Phase1ClinicalTrialERO_0001518Iterator.class);
			pageContext.getOut().print(thePhase1ClinicalTrialERO_0001518Iterator.getERO_0001518());
		} catch (Exception e) {
			log.error("Can't find enclosing Phase1ClinicalTrial for ERO_0001518 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase1ClinicalTrial for ERO_0001518 tag ");
		}
		return SKIP_BODY;
	}
}

