package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractEanucc13Iterator theAbstract = (AbstractEanucc13Iterator)findAncestorWithClass(this, AbstractEanucc13Iterator.class);
			pageContext.getOut().print(theAbstract.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

