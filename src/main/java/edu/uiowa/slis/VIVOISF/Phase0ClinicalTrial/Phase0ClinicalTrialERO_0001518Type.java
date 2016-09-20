package edu.uiowa.slis.VIVOISF.Phase0ClinicalTrial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase0ClinicalTrialERO_0001518Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase0ClinicalTrialERO_0001518Type currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase0ClinicalTrialERO_0001518Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Phase0ClinicalTrialERO_0001518Iterator thePhase0ClinicalTrialERO_0001518Iterator = (Phase0ClinicalTrialERO_0001518Iterator)findAncestorWithClass(this, Phase0ClinicalTrialERO_0001518Iterator.class);
			pageContext.getOut().print(thePhase0ClinicalTrialERO_0001518Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Phase0ClinicalTrial for ERO_0001518 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase0ClinicalTrial for ERO_0001518 tag ");
		}
		return SKIP_BODY;
	}
}

