package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MapTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapTranscriptOfIterator theMapTranscriptOfIterator = (MapTranscriptOfIterator)findAncestorWithClass(this, MapTranscriptOfIterator.class);
			pageContext.getOut().print(theMapTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

