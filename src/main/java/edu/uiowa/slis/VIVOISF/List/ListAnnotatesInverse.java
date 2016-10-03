package edu.uiowa.slis.VIVOISF.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ListAnnotatesInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ListAnnotatesInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ListAnnotatesInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ListAnnotatesInverseIterator theListAnnotatesInverseIterator = (ListAnnotatesInverseIterator)findAncestorWithClass(this, ListAnnotatesInverseIterator.class);
			pageContext.getOut().print(theListAnnotatesInverseIterator.getAnnotatesInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing List for annotates tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for annotates tag ");
		}
		return SKIP_BODY;
	}
}

