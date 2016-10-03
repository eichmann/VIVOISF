package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractAuthorListIterator theAbstractAuthorListIterator = (AbstractAuthorListIterator)findAncestorWithClass(this, AbstractAuthorListIterator.class);
			pageContext.getOut().print(theAbstractAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for authorList tag ");
		}
		return SKIP_BODY;
	}
}

