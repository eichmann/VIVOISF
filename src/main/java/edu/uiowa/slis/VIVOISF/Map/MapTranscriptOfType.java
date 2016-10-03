package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MapTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapTranscriptOfIterator theMapTranscriptOfIterator = (MapTranscriptOfIterator)findAncestorWithClass(this, MapTranscriptOfIterator.class);
			pageContext.getOut().print(theMapTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

