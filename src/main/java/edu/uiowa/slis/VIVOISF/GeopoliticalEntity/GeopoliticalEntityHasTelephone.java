package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityHasTelephoneIterator theGeopoliticalEntityHasTelephoneIterator = (GeopoliticalEntityHasTelephoneIterator)findAncestorWithClass(this, GeopoliticalEntityHasTelephoneIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

