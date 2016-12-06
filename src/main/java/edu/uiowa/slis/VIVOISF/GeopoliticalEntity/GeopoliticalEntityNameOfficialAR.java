package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameOfficialARIterator theGeopoliticalEntity = (GeopoliticalEntityNameOfficialARIterator)findAncestorWithClass(this, GeopoliticalEntityNameOfficialARIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

