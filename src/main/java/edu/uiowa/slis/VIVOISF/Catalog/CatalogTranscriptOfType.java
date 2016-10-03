package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogTranscriptOfIterator theCatalogTranscriptOfIterator = (CatalogTranscriptOfIterator)findAncestorWithClass(this, CatalogTranscriptOfIterator.class);
			pageContext.getOut().print(theCatalogTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

