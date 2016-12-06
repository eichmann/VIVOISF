package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameShortENIterator theGeopoliticalEntity = (GeopoliticalEntityNameShortENIterator)findAncestorWithClass(this, GeopoliticalEntityNameShortENIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

