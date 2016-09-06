package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractIAO_0000136Iterator theAbstractIAO_0000136Iterator = (AbstractIAO_0000136Iterator)findAncestorWithClass(this, AbstractIAO_0000136Iterator.class);
			pageContext.getOut().print(theAbstractIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

