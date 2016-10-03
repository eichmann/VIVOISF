package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyOclcnumIterator theCaseStudy = (CaseStudyOclcnumIterator)findAncestorWithClass(this, CaseStudyOclcnumIterator.class);
			pageContext.getOut().print(theCaseStudy.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

