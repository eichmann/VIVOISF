package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteEditionIterator theStatute = (StatuteEditionIterator)findAncestorWithClass(this, StatuteEditionIterator.class);
			pageContext.getOut().print(theStatute.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for edition tag ");
		}
		return SKIP_BODY;
	}
}

