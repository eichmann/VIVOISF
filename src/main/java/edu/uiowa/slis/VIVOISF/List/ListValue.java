package edu.uiowa.slis.VIVOISF.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ListValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ListValue currentInstance = null;
	private static final Log log = LogFactory.getLog(ListValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ListValueIterator theListValueIterator = (ListValueIterator)findAncestorWithClass(this, ListValueIterator.class);
			pageContext.getOut().print(theListValueIterator.getValue());
		} catch (Exception e) {
			log.error("Can't find enclosing List for value tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for value tag ");
		}
		return SKIP_BODY;
	}
}

