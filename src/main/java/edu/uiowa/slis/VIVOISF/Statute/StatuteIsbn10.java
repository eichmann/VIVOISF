package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteIsbn10Iterator theStatute = (StatuteIsbn10Iterator)findAncestorWithClass(this, StatuteIsbn10Iterator.class);
			pageContext.getOut().print(theStatute.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

