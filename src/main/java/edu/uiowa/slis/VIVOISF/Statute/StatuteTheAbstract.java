package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteTheAbstractIterator theStatute = (StatuteTheAbstractIterator)findAncestorWithClass(this, StatuteTheAbstractIterator.class);
			pageContext.getOut().print(theStatute.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

