package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(areaTelephone.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaTelephoneIterator thearea = (areaTelephoneIterator)findAncestorWithClass(this, areaTelephoneIterator.class);
			pageContext.getOut().print(thearea.getTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing area for telephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for telephone tag ");
		}
		return SKIP_BODY;
	}
}

