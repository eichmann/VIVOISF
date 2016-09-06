package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractPmidIterator theAbstract = (AbstractPmidIterator)findAncestorWithClass(this, AbstractPmidIterator.class);
			pageContext.getOut().print(theAbstract.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for pmid tag ");
		}
		return SKIP_BODY;
	}
}

