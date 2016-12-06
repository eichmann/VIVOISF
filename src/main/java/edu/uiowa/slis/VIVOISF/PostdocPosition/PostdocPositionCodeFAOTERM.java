package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionCodeFAOTERMIterator thePostdocPosition = (PostdocPositionCodeFAOTERMIterator)findAncestorWithClass(this, PostdocPositionCodeFAOTERMIterator.class);
			pageContext.getOut().print(thePostdocPosition.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

