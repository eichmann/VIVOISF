package edu.uiowa.slis.VIVOISF.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ListValueInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ListValueInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ListValueInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ListValueInverseIterator theListValueInverseIterator = (ListValueInverseIterator)findAncestorWithClass(this, ListValueInverseIterator.class);
			pageContext.getOut().print(theListValueInverseIterator.getValueInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing List for value tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for value tag ");
		}
		return SKIP_BODY;
	}
}

