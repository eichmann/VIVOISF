package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyHandleIterator theCaseStudy = (CaseStudyHandleIterator)findAncestorWithClass(this, CaseStudyHandleIterator.class);
			pageContext.getOut().print(theCaseStudy.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for handle tag ");
		}
		return SKIP_BODY;
	}
}

