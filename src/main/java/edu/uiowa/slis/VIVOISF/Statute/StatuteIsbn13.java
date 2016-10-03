package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteIsbn13Iterator theStatute = (StatuteIsbn13Iterator)findAncestorWithClass(this, StatuteIsbn13Iterator.class);
			pageContext.getOut().print(theStatute.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

