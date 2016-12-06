package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupFreetextKeywordIterator thespecial_group = (special_groupFreetextKeywordIterator)findAncestorWithClass(this, special_groupFreetextKeywordIterator.class);
			pageContext.getOut().print(thespecial_group.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

