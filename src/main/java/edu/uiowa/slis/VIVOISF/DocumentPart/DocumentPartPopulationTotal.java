package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartPopulationTotalIterator theDocumentPart = (DocumentPartPopulationTotalIterator)findAncestorWithClass(this, DocumentPartPopulationTotalIterator.class);
			pageContext.getOut().print(theDocumentPart.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

