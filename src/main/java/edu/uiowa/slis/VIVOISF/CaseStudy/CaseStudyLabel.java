package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudy theCaseStudy = (CaseStudy)findAncestorWithClass(this, CaseStudy.class);
			if (!theCaseStudy.commitNeeded) {
				pageContext.getOut().print(theCaseStudy.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			CaseStudy theCaseStudy = (CaseStudy)findAncestorWithClass(this, CaseStudy.class);
			return theCaseStudy.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing CaseStudy for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			CaseStudy theCaseStudy = (CaseStudy)findAncestorWithClass(this, CaseStudy.class);
			theCaseStudy.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for label tag ");
		}
	}
}

