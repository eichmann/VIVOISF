package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameOfficialFRIterator theGeopoliticalEntity = (GeopoliticalEntityNameOfficialFRIterator)findAncestorWithClass(this, GeopoliticalEntityNameOfficialFRIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

