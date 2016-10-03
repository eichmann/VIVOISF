package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmProducerIterator theFilmProducerIterator = (FilmProducerIterator)findAncestorWithClass(this, FilmProducerIterator.class);
			pageContext.getOut().print(theFilmProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for producer tag ");
		}
		return SKIP_BODY;
	}
}

