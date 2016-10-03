package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractSection currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractSectionIterator theAbstract = (AbstractSectionIterator)findAncestorWithClass(this, AbstractSectionIterator.class);
			pageContext.getOut().print(theAbstract.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for section tag ");
		}
		return SKIP_BODY;
	}
}

