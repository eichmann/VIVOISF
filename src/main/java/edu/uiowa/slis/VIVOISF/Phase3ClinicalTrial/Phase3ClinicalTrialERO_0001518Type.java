package edu.uiowa.slis.VIVOISF.Phase3ClinicalTrial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase3ClinicalTrialERO_0001518Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase3ClinicalTrialERO_0001518Type currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase3ClinicalTrialERO_0001518Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Phase3ClinicalTrialERO_0001518Iterator thePhase3ClinicalTrialERO_0001518Iterator = (Phase3ClinicalTrialERO_0001518Iterator)findAncestorWithClass(this, Phase3ClinicalTrialERO_0001518Iterator.class);
			pageContext.getOut().print(thePhase3ClinicalTrialERO_0001518Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Phase3ClinicalTrial for ERO_0001518 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase3ClinicalTrial for ERO_0001518 tag ");
		}
		return SKIP_BODY;
	}
}

