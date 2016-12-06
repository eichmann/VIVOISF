package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameOfficialITIterator theGeopoliticalEntity = (GeopoliticalEntityNameOfficialITIterator)findAncestorWithClass(this, GeopoliticalEntityNameOfficialITIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

