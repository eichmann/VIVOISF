package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameListENIterator theGeopoliticalEntity = (GeopoliticalEntityNameListENIterator)findAncestorWithClass(this, GeopoliticalEntityNameListENIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

