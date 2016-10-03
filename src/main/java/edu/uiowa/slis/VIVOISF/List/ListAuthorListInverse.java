package edu.uiowa.slis.VIVOISF.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ListAuthorListInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ListAuthorListInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ListAuthorListInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ListAuthorListInverseIterator theListAuthorListInverseIterator = (ListAuthorListInverseIterator)findAncestorWithClass(this, ListAuthorListInverseIterator.class);
			pageContext.getOut().print(theListAuthorListInverseIterator.getAuthorListInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing List for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for authorList tag ");
		}
		return SKIP_BODY;
	}
}

