package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteSici currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteSiciIterator theStatute = (StatuteSiciIterator)findAncestorWithClass(this, StatuteSiciIterator.class);
			pageContext.getOut().print(theStatute.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for sici tag ");
		}
		return SKIP_BODY;
	}
}

