package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentAuthorListIterator thePatentAuthorListIterator = (PatentAuthorListIterator)findAncestorWithClass(this, PatentAuthorListIterator.class);
			pageContext.getOut().print(thePatentAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for authorList tag ");
		}
		return SKIP_BODY;
	}
}

