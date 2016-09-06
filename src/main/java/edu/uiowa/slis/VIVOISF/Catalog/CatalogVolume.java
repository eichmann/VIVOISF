package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CatalogVolumeIterator theCatalog = (CatalogVolumeIterator)findAncestorWithClass(this, CatalogVolumeIterator.class);
			pageContext.getOut().print(theCatalog.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for volume tag ");
		}
		return SKIP_BODY;
	}
}

