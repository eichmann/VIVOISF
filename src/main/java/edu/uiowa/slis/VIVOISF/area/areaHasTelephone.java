package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaHasTelephoneIterator theareaHasTelephoneIterator = (areaHasTelephoneIterator)findAncestorWithClass(this, areaHasTelephoneIterator.class);
			pageContext.getOut().print(theareaHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

