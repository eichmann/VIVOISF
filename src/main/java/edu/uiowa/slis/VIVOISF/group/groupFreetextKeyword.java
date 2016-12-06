package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(groupFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupFreetextKeywordIterator thegroup = (groupFreetextKeywordIterator)findAncestorWithClass(this, groupFreetextKeywordIterator.class);
			pageContext.getOut().print(thegroup.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing group for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

