package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteUpcIterator theStatute = (StatuteUpcIterator)findAncestorWithClass(this, StatuteUpcIterator.class);
			pageContext.getOut().print(theStatute.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for upc tag ");
		}
		return SKIP_BODY;
	}
}

