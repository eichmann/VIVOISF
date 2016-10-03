package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractIsbn13Iterator theAbstract = (AbstractIsbn13Iterator)findAncestorWithClass(this, AbstractIsbn13Iterator.class);
			pageContext.getOut().print(theAbstract.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

