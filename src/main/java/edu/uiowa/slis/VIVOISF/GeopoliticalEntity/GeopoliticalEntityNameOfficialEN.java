package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameOfficialENIterator theGeopoliticalEntity = (GeopoliticalEntityNameOfficialENIterator)findAncestorWithClass(this, GeopoliticalEntityNameOfficialENIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

