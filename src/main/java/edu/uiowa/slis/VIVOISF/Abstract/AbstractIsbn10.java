package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractIsbn10Iterator theAbstract = (AbstractIsbn10Iterator)findAncestorWithClass(this, AbstractIsbn10Iterator.class);
			pageContext.getOut().print(theAbstract.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

