package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractDoiIterator theAbstract = (AbstractDoiIterator)findAncestorWithClass(this, AbstractDoiIterator.class);
			pageContext.getOut().print(theAbstract.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for doi tag ");
		}
		return SKIP_BODY;
	}
}

