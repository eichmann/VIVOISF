package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractContent currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractContentIterator theAbstract = (AbstractContentIterator)findAncestorWithClass(this, AbstractContentIterator.class);
			pageContext.getOut().print(theAbstract.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for content tag ");
		}
		return SKIP_BODY;
	}
}

