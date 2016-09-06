package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyIAO_0000136Iterator theCaseStudyIAO_0000136Iterator = (CaseStudyIAO_0000136Iterator)findAncestorWithClass(this, CaseStudyIAO_0000136Iterator.class);
			pageContext.getOut().print(theCaseStudyIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

