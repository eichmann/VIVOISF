package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractSici currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractSiciIterator theAbstract = (AbstractSiciIterator)findAncestorWithClass(this, AbstractSiciIterator.class);
			pageContext.getOut().print(theAbstract.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for sici tag ");
		}
		return SKIP_BODY;
	}
}

