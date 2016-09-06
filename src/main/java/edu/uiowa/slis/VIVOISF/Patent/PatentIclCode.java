package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentIclCode extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentIclCode currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentIclCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentIclCodeIterator thePatent = (PatentIclCodeIterator)findAncestorWithClass(this, PatentIclCodeIterator.class);
			pageContext.getOut().print(thePatent.getIclCode());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for iclCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for iclCode tag ");
		}
		return SKIP_BODY;
	}
}

