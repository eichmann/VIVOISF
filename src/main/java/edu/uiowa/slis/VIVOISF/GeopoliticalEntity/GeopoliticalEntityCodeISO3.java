package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityCodeISO3Iterator theGeopoliticalEntity = (GeopoliticalEntityCodeISO3Iterator)findAncestorWithClass(this, GeopoliticalEntityCodeISO3Iterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

