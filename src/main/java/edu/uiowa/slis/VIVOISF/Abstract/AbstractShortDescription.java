package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractShortDescriptionIterator theAbstract = (AbstractShortDescriptionIterator)findAncestorWithClass(this, AbstractShortDescriptionIterator.class);
			pageContext.getOut().print(theAbstract.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

